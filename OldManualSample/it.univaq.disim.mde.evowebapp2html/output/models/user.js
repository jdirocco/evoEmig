app.models.user = (function() {
  var user = {
    endpoint: '/api/users/[:id]',
    props: {
      'name': 'string',
      'surname': 'string',
      'age': 'number',
      'id': 'string',
    }
  };
  return user;
})();
