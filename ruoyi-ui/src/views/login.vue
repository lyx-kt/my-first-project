<template>
  <div class="login">
    <el-form ref="loginForm" :model="loginForm" :rules="loginRules" class="login-form">
      <h3 class="title">{{title}}</h3>
      <!-- 登录方式选择 -->
      <el-radio-group v-model="loginForm.loginType" size="small" style="margin-bottom: 15px; width: 100%; text-align: center;">
        <el-radio-button label="username">用户名</el-radio-button>
        <el-radio-button label="phone">手机号</el-radio-button>
        <el-radio-button label="email">邮箱</el-radio-button>
      </el-radio-group>
      <!-- 用户名登录 -->
      <el-form-item prop="username" v-if="loginForm.loginType === 'username'">
        <el-input
          v-model="loginForm.username"
          type="text"
          auto-complete="off"
          placeholder="请输入用户名"
        >
          <svg-icon slot="prefix" icon-class="user" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <!-- 手机号登录 -->
      <el-form-item prop="phone" v-if="loginForm.loginType === 'phone'">
        <el-input
          v-model="loginForm.phone"
          type="text"
          auto-complete="off"
          placeholder="请输入手机号"
          maxlength="11"
        >
          <svg-icon slot="prefix" icon-class="phone" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <!-- 邮箱登录 -->
      <el-form-item prop="email" v-if="loginForm.loginType === 'email'">
        <el-input
          v-model="loginForm.email"
          type="text"
          auto-complete="off"
          placeholder="请输入邮箱"
        >
          <svg-icon slot="prefix" icon-class="email" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input
          v-model="loginForm.password"
          type="password"
          auto-complete="off"
          placeholder="密码"
          @keyup.enter.native="handleLogin"
        >
          <svg-icon slot="prefix" icon-class="password" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <el-form-item prop="code" v-if="captchaEnabled">
        <el-input
          v-model="loginForm.code"
          auto-complete="off"
          placeholder="验证码"
          style="width: 63%"
          @keyup.enter.native="handleLogin"
        >
          <svg-icon slot="prefix" icon-class="validCode" class="el-input__icon input-icon" />
        </el-input>
        <div class="login-code">
          <img :src="codeUrl" @click="getCode" class="login-code-img"/>
        </div>
      </el-form-item>
      <el-checkbox v-model="loginForm.rememberMe" style="margin:0px 0px 25px 0px;">记住密码</el-checkbox>
      <el-form-item style="width:100%;">
        <el-button
          :loading="loading"
          size="medium"
          type="primary"
          style="width:100%;"
          @click.native.prevent="handleLogin"
        >
          <span v-if="!loading">登 录</span>
          <span v-else>登 录 中...</span>
        </el-button>
        <div style="float: right;" v-if="register">
          <router-link class="link-type" :to="'/register'">立即注册</router-link>
        </div>
      </el-form-item>
    </el-form>
    <!--  底部  -->
    <div class="el-login-footer">
      <span>Copyright © 2018-2025 ruoyi.vip All Rights Reserved.</span>
    </div>
  </div>
</template>

<script>
import { getCodeImg } from "@/api/login"
import Cookies from "js-cookie"
import { encrypt, decrypt } from '@/utils/jsencrypt'

export default {
  name: "Login",
  data() {
    return {
      title: process.env.VUE_APP_TITLE,
      codeUrl: "",
      loginForm: {
        loginType: "username",
        username: "admin",
        phone: "",
        email: "",
        password: "admin123",
        rememberMe: false,
        code: "",
        uuid: ""
      },
      loginRules: {
        username: [
          { required: true, trigger: "blur", message: "请输入您的用户名" }
        ],
        phone: [
          { required: true, trigger: "blur", message: "请输入您的手机号" },
          { pattern: /^1[3-9]\d{9}$/, message: "请输入正确的手机号格式", trigger: "blur" }
        ],
        email: [
          { required: true, trigger: "blur", message: "请输入您的邮箱" },
          { type: 'email', message: "请输入正确的邮箱格式", trigger: "blur" }
        ],
        password: [
          { required: true, trigger: "blur", message: "请输入您的密码" }
        ],
        code: [{ required: true, trigger: "change", message: "请输入验证码" }]
      },
      loading: false,
      // 验证码开关
      captchaEnabled: true,
      // 注册开关
      register: true,
      redirect: undefined
    }
  },
  watch: {
    $route: {
      handler: function(route) {
        this.redirect = route.query && route.query.redirect
      },
      immediate: true
    }
  },
  created() {
    this.getCode()
    this.getCookie()
  },
  methods: {
    getCode() {
      getCodeImg().then(res => {
        this.captchaEnabled = res.captchaEnabled === undefined ? true : res.captchaEnabled
        if (this.captchaEnabled) {
          this.codeUrl = "data:image/gif;base64," + res.img
          this.loginForm.uuid = res.uuid
        }
      })
    },
    getCookie() {
      const loginType = Cookies.get("loginType")
      const username = Cookies.get("username")
      const phone = Cookies.get("phone")
      const email = Cookies.get("email")
      const password = Cookies.get("password")
      const rememberMe = Cookies.get('rememberMe')
      this.loginForm.loginType = loginType === undefined ? this.loginForm.loginType : loginType
      this.loginForm.username = username === undefined ? this.loginForm.username : username
      this.loginForm.phone = phone === undefined ? this.loginForm.phone : phone
      this.loginForm.email = email === undefined ? this.loginForm.email : email
      this.loginForm.password = password === undefined ? this.loginForm.password : decrypt(password)
      this.loginForm.rememberMe = rememberMe === undefined ? false : Boolean(rememberMe)
    },
    handleLogin() {
      this.$refs.loginForm.validate(valid => {
        if (valid) {
          this.loading = true
          if (this.loginForm.rememberMe) {
            Cookies.set("loginType", this.loginForm.loginType, { expires: 30 })
            Cookies.set("username", this.loginForm.username, { expires: 30 })
            Cookies.set("phone", this.loginForm.phone, { expires: 30 })
            Cookies.set("email", this.loginForm.email, { expires: 30 })
            Cookies.set("password", encrypt(this.loginForm.password), { expires: 30 })
            Cookies.set('rememberMe', this.loginForm.rememberMe, { expires: 30 })
          } else {
            Cookies.remove("loginType")
            Cookies.remove("username")
            Cookies.remove("phone")
            Cookies.remove("email")
            Cookies.remove("password")
            Cookies.remove('rememberMe')
          }
          this.$store.dispatch("Login", this.loginForm).then(() => {
            this.$router.push({ path: this.redirect || "/" }).catch(()=>{})
          }).catch(() => {
            this.loading = false
            if (this.captchaEnabled) {
              this.getCode()
            }
          })
        }
      })
    }
  }
}
</script>

<style rel="stylesheet/scss" lang="scss">
.login {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
  background-image: url("../assets/images/login-background.jpg");
  background-size: cover;
}
.title {
  margin: 0px auto 30px auto;
  text-align: center;
  color: #707070;
}

.login-form {
  border-radius: 6px;
  background: #ffffff;
  width: 400px;
  padding: 25px 25px 5px 25px;
  z-index: 1;
  .el-input {
    height: 38px;
    input {
      height: 38px;
    }
  }
  .input-icon {
    height: 39px;
    width: 14px;
    margin-left: 2px;
  }
}
.login-tip {
  font-size: 13px;
  text-align: center;
  color: #bfbfbf;
}
.login-code {
  width: 33%;
  height: 38px;
  float: right;
  img {
    cursor: pointer;
    vertical-align: middle;
  }
}
.el-login-footer {
  height: 40px;
  line-height: 40px;
  position: fixed;
  bottom: 0;
  width: 100%;
  text-align: center;
  color: #fff;
  font-family: Arial;
  font-size: 12px;
  letter-spacing: 1px;
}
.login-code-img {
  height: 38px;
}
</style>
