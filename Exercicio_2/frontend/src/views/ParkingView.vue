<template>
  <div>
    <DataTable apiUrl="parking/api/v1/customer/" title="Table Customer" :columns="['id','name', 'card_id']" />
  </div>
  <div>
    <DataTable apiUrl="parking/api/v1/plan/" title="Table Plan" :columns="['id','description', 'value']" />
  </div>
  <div>
    <DataTable apiUrl="parking/api/v1/vehicle/" title="Table Vehicle" :columns="['id','plate', 'model','description', 'customer_id']" />
  </div>
  <div>
    <DataTable apiUrl="parking/api/v1/contract/" title="Table Contract" :columns="['id','description', 'max_value']" />
  </div>
  <div>
    <DataTable apiUrl="parking/api/v1/customervehicle/" title="Table Customer Vehicle" :columns="['id','plate', 'model','description', 'customer_id',]" />
  </div>
  <div>
    <DataTable apiUrl="parking/api/v1/customerplan/" title="Table de customer Plan" :columns="['id','due_date', 'customer_id','plan_id']" />
  </div>
  <div>
    <DataTable apiUrl="parking/api/v1/parkmovement/" title="Table Parkmovement" :columns="['id','entry_date', 'exit_date','vehicle_id','value']" />
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