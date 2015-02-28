app.controllers.UsersPageController = (function() {
  var UsersPageController = { 
    parameters: {
      'user': {
        baseType: 'object',
        customType: 'app.models.user'
      },
    }
  };
  return UsersPageController;
})();
