<template>
  <div>
    <h2>Exemplo de Tabela Vue.js</h2>
    
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Nome</th>
          <th>Card ID</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="customer in APIData" :key="customer.id">
          <td>{{ customer.id }}</td>
          <td>{{ customer.name }}</td>
          <td>{{ customer.card_id }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
// Importe a instância do Axios
import getAPI from '../axios-api';

export default {
  name: "Parking",
  data() {
    return {
      APIData: [],
    };
  },
  mounted() {
    getAPI
      .get("parking/api/v1/customer/")  // Certifique-se de que a rota completa está correta
      .then((response) => {
        console.log("Post API has received data");
        this.APIData = response.data;
      })
      .catch((err) => {
        console.log(err);
      });
  },
};

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