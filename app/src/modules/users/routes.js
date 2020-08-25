import RouterView from "@/views/RouterView";

export default {
    path: "/users",
    component: RouterView,
    children: [
        {
            path: "/",
            name: "users.list",
            component: RouterView
        },
        {
            path: "/add",
            name: "users.add",
            component: RouterView
        }
    ]
}