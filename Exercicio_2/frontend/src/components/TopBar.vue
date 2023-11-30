<template>
  <div class="top-bar">
    <div class="title">
      <h1>Parking</h1>
    </div>
    <div class="router-box">
      <div class="router-title">
        <ul>
          <li><router-link to="/">Home</router-link></li>
   
          <li> <router-link to="/parking">All</router-link></li>
          <li>Customer</li>
          <li>Plan</li>
          <li>Vehicle</li>
          <li>Contract</li>
          <li>Customer Vehicle</li>
          <li>Customer Planner</li>
          <li>Park Movement</li>
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
  padding: 1rem;
}

.router-title li:hover {
  text-decoration: underline;
}

.router-title li:hover:active {
  text-decoration: underline;
  background-color: #4e3939;
  border-radius: 1rem;
}
</style>
