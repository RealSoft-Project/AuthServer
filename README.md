# AuthServer
 - Creates some users at the kick-start of the application 
 - Generate tokes when we request to log in with credentials

#Created Users 



          ` userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
               `

            userService.saveUser(new User(null, "Johny Depp", "depp", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Will Smith", "smith", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Bradley Cooper", "cooper", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Ryan Reynolds", "reynolds", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Tom Hanks", "hanks", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Tom Holland", "holland", "123", new ArrayList<>()));

            userService.addRoleToUser("depp", "ROLE_USER");
            userService.addRoleToUser("smith", "ROLE_MANAGER");
            userService.addRoleToUser("cooper", "ROLE_MANAGER");
            userService.addRoleToUser("reynolds", "ROLE_USER");
            userService.addRoleToUser("hanks", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("depp", "ROLE_ADMIN");`

#Login Example 

`"name": "Johny Depp",
"username": "depp",
"password": "123"`