import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

let MyCommit = () => import("../views/MyCommit");
let CommitList = () => import("../views/CommitList");
let NewMember = () => import("../views/NewMember");
let ToDoList = () => import("../views/ToDoList");

const routes = [
  {
    path: '/',
    name: 'myCommit',
    component : MyCommit
  },
  {
    path: '/commit-list',
    name: 'commitList',
    component : CommitList
  },
  {
    path: '/new-member',
    name: 'newMember',
    component : NewMember
  },
  {
    path: '/to-do-list',
    name: 'toDoList',
    component : ToDoList
  }
  // {
  //   path: '/about',
  //   name: 'About',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: function () {
  //     return import(/* webpackChunkName: "about" */ '../views/About.vue')
  //   }
  // }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
