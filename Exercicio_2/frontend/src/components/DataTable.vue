<template>
  <div class="table-box">
    <h2 class="title">{{ title }}</h2>
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
  .table-box{
    margin-top: 1.5rem;
    display: flex;
    background-color: #f2f2f2;
    flex-direction: column;
    border-radius:1rem ;
    margin-bottom: 2rem;
    margin-left: 1rem;
    margin-left: auto;
    margin-right: auto;
    max-width: 70rem;
  }
  .title{
    display: flex;
    align-items: center;
    justify-content: center;
    text-transform: uppercase;
    padding-top: 1rem;
  }
  .tible{
    display: flex;
    background-color: #f2f2f2;
    flex-direction: column;
    border-radius:1rem ;
    margin-bottom: 2rem;
  }
  table {
    width: 100%;
    border-collapse: collapse;
    background-color: white
  }

  th, td {
    border: 1px solid #c0b3b3;
    padding: 0.4rem;
    text-align: left;
  }

  th {
    background-color: #ede3e3;
    text-transform: capitalize;
  }
</style>
