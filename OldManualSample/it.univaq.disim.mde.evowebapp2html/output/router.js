app.router = (function() {
  var router = {
    routes: {
      '/users/[:id]': app.controllers.UsersPageController,
    }
  };
  return router;
})();
