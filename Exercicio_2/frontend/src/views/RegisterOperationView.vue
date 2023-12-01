<template>
  <div>
    <RegisterOperation />
  </div>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";
import RegisterOperation from "@/components/RegisterOperation.vue";

@Options({
  components: {
    RegisterOperation,
  },
})
export default class RegisterOperationView extends Vue {}
</script>
