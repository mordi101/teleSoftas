# teleSoftas
Task 1: Practical Task assessment
___________________________________________________________

I will first make sure that I am given Admin rights
-I think I will test it first by send the request as an Admin 
- then I will switch from Admin to limited 
- then switch from limited back to Admin

There are some blockers pertaining to the testing of this API. We were not provided with test data for {accountNr} and {msisdn} and these test data are required for making the API calls. 

Also, the information given is a little confusing, it's says API calls toggles the user's status from admin to Limited; does that mean if i send an API call for "isAdmin": false, this changes it to Limited?

Furthermore, it says only Admin users can change the user's status, there is no information given on how to identify an admin user. 
Does the account number or msisdn denote an admin user? 
or is it the url "/admin"? 
or is it changing the body to "isAdmin": true ?

