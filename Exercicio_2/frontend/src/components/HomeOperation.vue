<template>
  <div>
    <h1>Tela de Operação</h1>

    <!-- Placa -->
    <div class="form-group">
      <label for="placa">Placa do Veículo:</label>
      <input
        class="inputPlaca"
        v-model="placa"
        type="text"
        id="placa"
        required
      />
    </div>

    <!-- Valor a Cobrar (Desabilitado inicialmente) -->
    <div class="form-group">
      <label for="valorCobrar">Valor a Cobrar:</label>
      <input v-model="valorCobrar" type="text" id="valorCobrar" disabled />
    </div>

    <!-- Grade (Grid) de Veículos no Pátio -->
    <div class="vehicle-list">
      <h2>Veículos no Pátio</h2>
      <table>
        <thead>
          <tr>
            <th>Data de Entrada</th>
            <th>Placa</th>
            <th>Cartão</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="veiculo in veiculos" :key="veiculo.id">
            <td>{{ veiculo.id }}</td>
            <td>{{ veiculo.entry_date }}</td>
            <td>{{ veiculo.vehicle.plate }}</td>
            <td>{{ veiculo.vehicle.customer.card_id }}</td>
          </tr>
        </tbody>
      </table>
    </div>

    <!-- Botão de Entrada -->
    <button @click="registrarEntrada" class="btn btn-primary">
      Registrar Entrada
    </button>

    <!-- Botão de Saída (Desabilitado inicialmente) -->
    <button
      @click="registrarSaida"
      :disabled="!veiculos.length"
      class="btn btn-danger"
    >
      Registrar Saída
    </button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      placa: "",
      valorCobrar: "",
      veiculos: [],
    };
  },
  methods: {
    registrarEntrada() {
      const novoVeiculo = {
        id: this.veiculos.length + 1,
        entry_date: new Date().toLocaleString(),
        vehicle: {
          plate: this.placa,
          customer: {
            card_id: "cartao aleatorio???", 
          },
        },
      };
      this.veiculos.push(novoVeiculo);

      this.placa = "";
      this.valorCobrar = "";
    },
    registrarSaida() {
        //primeiro arrumar a entrada
    },
  },
};
</script>

<style scoped>
.form-group {
  margin-bottom: 1rem;
}
.form-group,
label {
  font-size: 1.2rem;
}
.vehicle-list {
  margin-top: 20px;
}

table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 15px;
}

th, td {
  border: 1px solid #ddd;
  padding: 8px;
  text-align: left;
}

th {
  background-color: #f2f2f2;
}

.btn {
  padding: 10px 15px;
  margin-right: 10px;
  cursor: pointer;
  border: none;
  border-radius: 4px;
}

.btn-primary {
  background-color: #007bff;
  color: #fff;
}

.btn-danger {
  background-color: #dc3545;
  color: #fff;
}

.inputPlaca {
  border-color: black;
  border: 1px solid black;
  border-radius: 1rem;
  padding-left: 0.5rem;
  height: 1rem;
  font-size: 1rem;
  padding: 0.2rem;
}
</style>
