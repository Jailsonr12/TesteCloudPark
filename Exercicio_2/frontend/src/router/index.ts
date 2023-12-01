import { createRouter, createWebHashHistory, RouteRecordRaw } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'home',
    component: () => import('../views/HomeOperationView.vue')
  },
  {
    path: '/register',
    name: 'register',
    component: () => import('../views/RegisterOperationView.vue')
  },
  {
    path: '/parking',
    name: 'parking',
    component: () => import('../views/ParkingView.vue')
  },
  {
    path: '/customer',
    name: 'customer',
    component: () => import('../views/CustomerView.vue')
  },
  {
    path: '/plan',
    name: 'plan',
    component: () => import('../views/PlanView.vue')
  },
  {
    path: '/vehicle',
    name: 'vehicle',
    component: () => import('../views/VehicleView.vue')
  },
  {
    path: '/contract',
    name: 'contract',
    component: () => import('../views/ContractView.vue')
  },
  {
    path: '/customer-vehicle',
    name: 'customervehicle',
    component: () => import('../views/CustomerVehicleView.vue')
  },
  {
    path: '/customer-planner',
    name: 'customerplanner',
    component: () => import('../views/CustomerPlannerView.vue')
  },
  {
    path: '/park-movement',
    name: 'ParkMovement',
    component: () => import('../views/ParkMovementView.vue')
  },
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
