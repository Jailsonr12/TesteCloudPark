<template>
  <div>
    <DataTable apiUrl="parking/api/v1/customer/" title="Table Customer" :columns="['id','name', 'card_id']" />
  </div>
</template>

<script lang="ts">

import { Options, Vue } from 'vue-class-component';
import DataTable from '@/components/DataTable.vue'; // @ is an alias to /src

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