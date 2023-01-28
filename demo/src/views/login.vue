<template>
  <el-form
      ref="loginRef"
      :model="loginForm"
      status-icon
      :rules="loginRules"
      label-width="120px"
      class="demo-ruleForm"
  >
    <el-form-item label="用户名" prop="username">
      <el-input v-model.number="loginForm.username"/>
    </el-form-item>
    <el-form-item label="密码" prop="password">
      <el-input v-model="loginForm.password" type="password" autocomplete="off"/>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="handleLogin"
      >Submit
      </el-button
      >
    </el-form-item>
  </el-form>
</template>

<script setup>
import {getCurrentInstance, reactive, ref} from 'vue'
import useUserStore from "../store/moudles/user.js";
import router from "../router/index.js";

const {proxy} = getCurrentInstance();
const userStore = useUserStore();

const loginForm = ref({
  username: '',
  password: ''
});

const loginRules = reactive({
  username: [{required: true, trigger: 'blur', message: '请输入你的账号'}],
  pass: [{required: true, trigger: 'blur', message: '请输入你的密码'}],
})


function handleLogin() {
  proxy.$refs.loginRef.validate(() => {
    // 调用action的登录方法
    userStore.login(loginForm.value).then(() => {
      router.push('/home');
    }).catch(() => {
      alert('haha');
    })
  })
}

</script>
