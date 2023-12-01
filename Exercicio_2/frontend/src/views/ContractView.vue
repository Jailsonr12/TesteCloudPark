<template>
  <div>
    <DataTable apiUrl="parking/api/v1/contract/" title="Table Contract" :columns="['id','description', 'max_value']" />
  </div>
</template>

<script lang="ts">

import { Options, Vue } from 'vue-class-component';
import DataTable from '@/components/DataTable.vue'; 

@Options({
  components: {
    DataTable,
  },
})
export default class HomeView extends Vue {}
</script>

<style lang="css">
  DataTable{
    display: flex;
    align-items: center;
  }
</style>