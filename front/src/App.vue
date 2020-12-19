<template>
  <v-app id="inspire">
    <navbar></navbar>
    <router-view></router-view>

  </v-app>

</template>

<script>
import Header from './components/Header'
import Navbar from './components/Navbar'

  export default {
    name: 'App',
    components : { 
      Header, 
      Navbar
    }
  }
</script>
