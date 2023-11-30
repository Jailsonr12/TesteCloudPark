<template>
  <div>
    <HomeOperation />
  </div>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";
import HomeOperation from "@/components/HomeOperation.vue";

@Options({
  components: {
    HomeOperation,
  },
})
export default class HomeOperationView extends Vue {}
</script>
