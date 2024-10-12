const base = {
    get() {
        return {
            url : "http://localhost:8080/waterVendingManage/",
            name: "waterVendingManage",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/waterVendingManage/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于java的社区自动售水机管理系统的设计与实现"
        } 
    }
}
export default base
