import{createRouter, createWebHashHistory} from 'vue-router'



const routes = [
    {
        path: '/login',
        component: import('@/views/login.vue')
    },
    {
        path: '/home',
        component: import('@/components/HelloWorld.vue')
    },
]

const router = createRouter({
    history: createWebHashHistory(),
    routes: routes
})

export default router
