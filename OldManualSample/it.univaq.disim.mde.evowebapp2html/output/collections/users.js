app.collections.users = (function() {
  var users = {
    endpoint: '/api/users',
    model: app.models.user
  };
  return users;
})();
