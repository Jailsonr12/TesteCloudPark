<template>
  <div>
    <DataTable apiUrl="parking/api/v1/customer/" title="Tabela de Clientes" :columns="['name', 'card_id']" />
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