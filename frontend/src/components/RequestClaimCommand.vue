<template>
    <v-card outlined>
        <v-card-title>
            RequestClaim
        </v-card-title>

        <v-card-text>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="requestClaim"
            >
                RequestClaim
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'RequestClaimCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.userId = '';
        },
        watch: {
        },
        methods: {
            requestClaim() {
                this.$emit('requestClaim', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

