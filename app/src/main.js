import Vue from "vue";
import App from "./App.vue";
import "./registerServiceWorker";
import router from "./configs/RouterConfig";
import store from "./configs/VuexConfig";

Vue.config.productionTip = false;

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount("#app");
