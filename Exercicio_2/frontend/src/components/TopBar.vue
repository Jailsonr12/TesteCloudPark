<template>
  <div class="top-bar">
    <div class="title">
      <h1>Parking</h1>
    </div>
    <div class="router-box">
      <div class="router-title">
        <ul>
          <li><router-link to="/" class="router-link">Home</router-link></li>
          <li><router-link to="/register" class="router-link">Register</router-link></li>
          <li><router-link to="/parking" class="router-link">All Table</router-link></li>
          <li><router-link to="/customer" class="router-link">Customer</router-link></li>
          <li><router-link to="/plan" class="router-link">Plan</router-link></li>
          <li><router-link to="/vehicle" class="router-link">Vehicle</router-link></li>
          <li><router-link to="/contract" class="router-link">Contract</router-link></li>
          <li><router-link to="/customer-vehicle" class="router-link">Customer Vehicle</router-link></li>
          <li><router-link to="/customer-planner" class="router-link">Customer Planner</router-link></li>
          <li><router-link to="/park-movement" class="router-link">Park Movement</router-link></li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
export default {
  name: "TopBar",
};
</script>

<style lang="css">
.top-bar {
  display: flex;
  justify-content: space-between;
  align-items: center;
  background-color: #222121;
  color: white;
  padding: 1rem;
}

.router-title ul {
  list-style-type: none;
  padding: 0;
  margin: 0;
  display: flex;
}

.router-title li {
  margin-right: 10px;
  cursor: pointer;
}

.router-title li .router-link {
  text-decoration: none;
  color: white;
  padding: 1rem;
}

.router-title li .router-link:hover {
  text-decoration: underline;
}

.router-title li .router-link:hover:active {
  text-decoration: underline;
  background-color: #4e3939;
  border-radius: 1rem;
}
</style>
