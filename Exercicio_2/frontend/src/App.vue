<template>
  <div id="app">
    <TopBar />
    <router-view />
  </div>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';
import TopBar from '@/components/TopBar.vue'; 

@Options({
  components: {
    TopBar,
  },
})
export default class App extends Vue {}
</script>

<style lang="scss">
*{
  border: 0;
  margin: 0;
  padding: 0;
}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}

nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
