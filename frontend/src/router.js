
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ClaimReceiptManager from "./components/listers/ClaimReceiptCards"
import ClaimReceiptDetail from "./components/listers/ClaimReceiptDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/claims/receipts',
                name: 'ClaimReceiptManager',
                component: ClaimReceiptManager
            },
            {
                path: '/claims/receipts/:id',
                name: 'ClaimReceiptDetail',
                component: ClaimReceiptDetail
            },




    ]
})
