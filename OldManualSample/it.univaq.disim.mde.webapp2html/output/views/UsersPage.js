app.views.UsersPage = (function() {
  var UsersPage = {
    subviews: [],
    template: app.templates.usersTemplate,
    data: {
      'users': app.collection.users,
    }
  };
  return UsersPage;
})();
