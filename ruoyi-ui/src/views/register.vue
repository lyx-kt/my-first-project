<template>
  <div class="register">
    <el-form ref="registerForm" :model="registerForm" :rules="registerRules" class="register-form">
      <h3 class="title">{{title}}</h3>
      <!-- 注册方式选择 -->
      <el-radio-group v-model="registerForm.registerType" size="small" style="margin-bottom: 15px; width: 100%; text-align: center;">
        <el-radio-button label="username">用户名</el-radio-button>
        <el-radio-button label="phone">手机号</el-radio-button>
        <el-radio-button label="email">邮箱</el-radio-button>
      </el-radio-group>
      <!-- 用户名注册 -->
      <el-form-item prop="username" v-if="registerForm.registerType === 'username'">
        <el-input v-model="registerForm.username" type="text" auto-complete="off" placeholder="请输入用户名">
          <svg-icon slot="prefix" icon-class="user" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <!-- 手机号注册 -->
      <el-form-item prop="countryCode" v-if="registerForm.registerType === 'phone'" label="国家/地区">
        <el-select v-model="registerForm.countryCode" placeholder="请选择国家/地区" filterable @change="handleCountryChange" style="width: 100%;">
          <el-option-group
            v-for="group in countryGroups"
            :key="group.label"
            :label="group.label">
            <el-option
              v-for="item in group.options"
              :key="item.countryCode"
              :label="item.countryName + ' ' + item.phoneCode"
              :value="item.countryCode">
              <span style="float: left">{{ item.countryName }}</span>
              <span style="float: right; color: #8492a6; font-size: 13px">{{ item.phoneCode }}</span>
            </el-option>
          </el-option-group>
        </el-select>
      </el-form-item>
      <el-form-item prop="phone" v-if="registerForm.registerType === 'phone'">
        <el-input v-model="registerForm.phone" type="text" auto-complete="off" placeholder="请输入手机号" maxlength="15">
          <template slot="prepend">{{ selectedPhoneCode }}</template>
          <svg-icon slot="prefix" icon-class="phone" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <!-- 邮箱注册 -->
      <el-form-item prop="email" v-if="registerForm.registerType === 'email'">
        <el-input v-model="registerForm.email" type="text" auto-complete="off" placeholder="请输入邮箱">
          <svg-icon slot="prefix" icon-class="email" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input
          v-model="registerForm.password"
          type="password"
          auto-complete="off"
          placeholder="密码"
          @keyup.enter.native="handleRegister"
        >
          <svg-icon slot="prefix" icon-class="password" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <el-form-item prop="confirmPassword">
        <el-input
          v-model="registerForm.confirmPassword"
          type="password"
          auto-complete="off"
          placeholder="确认密码"
          @keyup.enter.native="handleRegister"
        >
          <svg-icon slot="prefix" icon-class="password" class="el-input__icon input-icon" />
        </el-input>
      </el-form-item>
      <el-form-item prop="code" v-if="captchaEnabled">
        <el-input
          v-model="registerForm.code"
          auto-complete="off"
          placeholder="验证码"
          style="width: 63%"
          @keyup.enter.native="handleRegister"
        >
          <svg-icon slot="prefix" icon-class="validCode" class="el-input__icon input-icon" />
        </el-input>
        <div class="register-code">
          <img :src="codeUrl" @click="getCode" class="register-code-img"/>
        </div>
      </el-form-item>
      <el-form-item style="width:100%;">
        <el-button
          :loading="loading"
          size="medium"
          type="primary"
          style="width:100%;"
          @click.native.prevent="handleRegister"
        >
          <span v-if="!loading">注 册</span>
          <span v-else>注 册 中...</span>
        </el-button>
        <div style="float: right;">
          <router-link class="link-type" :to="'/login'">使用已有账户登录</router-link>
        </div>
      </el-form-item>
    </el-form>
    <!--  底部  -->
    <div class="el-register-footer">
      <span>Copyright © 2018-2025 ruoyi.vip All Rights Reserved.</span>
    </div>
  </div>
</template>

<script>
import { getCodeImg, register } from "@/api/login"
import { listCountryGrouped } from "@/api/system/country"

export default {
  name: "Register",
  data() {
    const equalToPassword = (rule, value, callback) => {
      if (this.registerForm.password !== value) {
        callback(new Error("两次输入的密码不一致"))
      } else {
        callback()
      }
    }
    return {
      title: process.env.VUE_APP_TITLE,
      codeUrl: "",
      registerForm: {
        registerType: "username",
        username: "",
        phone: "",
        email: "",
        password: "",
        confirmPassword: "",
        code: "",
        uuid: "",
        countryCode: "CN",
        phoneCode: "+86"
      },
      countryList: [],
      countryGroups: [],
      selectedPhoneCode: "+86",
      registerRules: {
        username: [
          { required: true, trigger: "blur", message: "请输入您的用户名" },
          { min: 2, max: 20, message: '用户名长度必须介于 2 和 20 之间', trigger: 'blur' }
        ],
        phone: [
          { required: true, trigger: "blur", message: "请输入您的手机号" },
          { pattern: /^\d{5,15}$/, message: "请输入5-15位数字的手机号", trigger: "blur" }
        ],
        email: [
          { required: true, trigger: "blur", message: "请输入您的邮箱" },
          { type: 'email', message: "请输入正确的邮箱格式", trigger: "blur" }
        ],
        countryCode: [
          { required: true, trigger: "change", message: "请选择国家/地区" }
        ],
        password: [
          { required: true, trigger: "blur", message: "请输入您的密码" },
          { min: 6, max: 20, message: "用户密码长度必须介于 6 和 20 之间", trigger: "blur" },
          { pattern: /^[^<>"'|\\]+$/, message: "不能包含非法字符：< > \" ' \\\\ |", trigger: "blur" }
        ],
        confirmPassword: [
          { required: true, trigger: "blur", message: "请再次输入您的密码" },
          { required: true, validator: equalToPassword, trigger: "blur" }
        ],
        code: [{ required: true, trigger: "change", message: "请输入验证码" }]
      },
      loading: false,
      captchaEnabled: true
    }
  },
  created() {
    this.getCode()
    this.loadCountryList()
  },
  methods: {
    // 加载国家列表
    loadCountryList() {
      listCountryGrouped().then(res => {
        const data = res.data
        this.countryGroups = []
        for (let continent in data) {
          this.countryGroups.push({
            label: continent,
            options: data[continent]
          })
        }
      })
    },
    // 国家选择变化
    handleCountryChange(countryCode) {
      // 查找选中的国家
      for (let group of this.countryGroups) {
        const country = group.options.find(c => c.countryCode === countryCode)
        if (country) {
          this.selectedPhoneCode = country.phoneCode
          this.registerForm.phoneCode = country.phoneCode
          break
        }
      }
    },
    getCode() {
      getCodeImg().then(res => {
        this.captchaEnabled = res.captchaEnabled === undefined ? true : res.captchaEnabled
        if (this.captchaEnabled) {
          this.codeUrl = "data:image/gif;base64," + res.img
          this.registerForm.uuid = res.uuid
        }
      })
    },
    handleRegister() {
      this.$refs.registerForm.validate(valid => {
        if (valid) {
          this.loading = true
          register(this.registerForm).then(res => {
            const registerType = this.registerForm.registerType
            let account = this.registerForm.username
            if (registerType === 'phone') {
              account = this.registerForm.phone
            } else if (registerType === 'email') {
              account = this.registerForm.email
            }
            this.$alert("<font color='red'>恭喜你，您的账号 " + account + " 注册成功！</font>", '系统提示', {
              dangerouslyUseHTMLString: true,
              type: 'success'
            }).then(() => {
              this.$router.push("/login")
            }).catch(() => {})
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
.register {
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

.register-form {
  border-radius: 6px;
  background: #ffffff;
  width: 400px;
  padding: 25px 25px 5px 25px;
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
.register-tip {
  font-size: 13px;
  text-align: center;
  color: #bfbfbf;
}
.register-code {
  width: 33%;
  height: 38px;
  float: right;
  img {
    cursor: pointer;
    vertical-align: middle;
  }
}
.el-register-footer {
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
.register-code-img {
  height: 38px;
}
</style>
