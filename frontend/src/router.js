
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ClaimReceiptManager from "./components/listers/ClaimReceiptCards"
import ClaimReceiptDetail from "./components/listers/ClaimReceiptDetail"

import ReviewReviewManager from "./components/listers/ReviewReviewCards"
import ReviewReviewDetail from "./components/listers/ReviewReviewDetail"

import BoundedContext1987PaymentManager from "./components/listers/BoundedContext1987PaymentCards"
import BoundedContext1987PaymentDetail from "./components/listers/BoundedContext1987PaymentDetail"


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

            {
                path: '/reviews/reviews',
                name: 'ReviewReviewManager',
                component: ReviewReviewManager
            },
            {
                path: '/reviews/reviews/:id',
                name: 'ReviewReviewDetail',
                component: ReviewReviewDetail
            },

            {
                path: '/boundedContext1987s/payments',
                name: 'BoundedContext1987PaymentManager',
                component: BoundedContext1987PaymentManager
            },
            {
                path: '/boundedContext1987s/payments/:id',
                name: 'BoundedContext1987PaymentDetail',
                component: BoundedContext1987PaymentDetail
            },



    ]
})
