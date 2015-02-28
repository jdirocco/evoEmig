app.views.UsersPage = (function() {
  var UsersPage = {
    subviews: [],
    template: app.templates.usersTemplate,
    data: {
      'users': {
        baseType: 'object',
        customType: 'app.collections.users'
      },
    }
  };
  return UsersPage;
})();
