<!-- DataTable Component (DataTable.vue) -->
<template>
  <div>
    <h2>{{ title }}</h2>
    <table>
      <thead>
        <tr>
          <th v-for="column in columns" :key="column">{{ column }}</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="item in items" :key="item.id">
          <td v-for="column in columns" :key="column">{{ item[column] }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';
import getAPI from '../axios-api';

@Options({
  props: {
    apiUrl: {
      type: String,
      required: true,
    },
    title: {
      type: String,
    },
    columns: {
      type: Array,
      required: true,
    },
  },
})
export default class DataTable extends Vue {
  apiUrl!: string; 
  title!: string; 
  columns!: string[]; 
  items: any[] = []; 
 
  mounted() {
    getAPI
      .get(this.apiUrl)
      .then((response: any) => {
        console.log(response.data)
        this.items = response.data;
      })
      .catch((err: string) => {
        console.log(err);
      });
  }
}
</script>

<style>
  table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
  }

  th, td {
    border: 1px solid #ddd;
    padding: 8px;
    text-align: left;
  }

  th {
    background-color: #f2f2f2;
  }
</style>
