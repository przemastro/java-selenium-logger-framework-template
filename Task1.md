# Task 1
This can be done in exploratory sessions, ad-hoc testing or more organized form like requirements-based testing. I present only tests I would run/execute/design. 

### Functional Testing
##### Positive:

###### 1. User can register
Test 1. User should be able to register when all fields are filled in.
| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field | 'Last Name' field is filled in |
| 5 | Click [Register] button | User is registered |

Expected result of last step can differ. It can be pop-up window with message that user account has been created. 

Test 2. Screen should appear and all buttons and fields should be enabled in dedicated browsers. Below test I would run against all browsers and devices that client requires.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field | 'Last Name' field is filled in |
| 5 | Click [Register] button | User is registered |

###### 2. Notification verification / user verification
Test 3. I can imagine that user has to be identified somehow that he is a human not a machine. For example link to authenticate user is sent into user's mailbox.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field | 'Last Name' field is filled in |
| 5 | Click [Register] button | Email is sent to user's mailbox |
| 6 | Navigate to the mailbox | Mailbox is open |
| 7 | Click authentication link | Window with welcome message is open |

##### Negative:
###### 1. Fields Validation - Frontend
###### 1.1 Boundary values verification
Number of characters in input fileds should be limited. Let say each input field has 50 characters limitation.

Test 4: User types 50 characters in each field (Positive scenario)
| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing 50 characters email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type 50 characters password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field with 50 characters | 'Last Name' field is filled in |
| 5 | Click [Register] button | User is registered |

Test 5. User types 51 characters in each field. Here validation can work in two ways: on clicking [Register] button or not allowing typing more than 50 characters. Let's prepare test for the first version.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing 51 characters email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type 51 characters password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field with 51 characters | 'Last Name' field is filled in |
| 5 | Click [Register] button | Validation messages appear below each input field |

###### 1.2 Mail field verification
Test 6. Mail format validation should be enabled.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type email with wrong format e.g. test@@cognified.com into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field | 'Last Name' field is filled in |
| 5 | Click [Register] button | validation error message should appear below E-Mail input field |
###### 1.3 Password & Confirm password fields verification
Test 7. Verification if password field is indeed password type field.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in with dots/stars|
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in with dots/stars |
| 4 | Fill in 'Last Name' field | 'Last Name' field is filled in |
| 5 | Click [Register] button | User account is created |

###### 1.4 Password & Confirm password fields binding
Test 8. Verification if 'Password' and 'Confirm Password' fields are binded. Again validation appears on [Register] button click.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in |
| 3 | Type different password than in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in  |
| 4 | Fill in 'Last Name' field | 'Last Name' field is filled in |
| 5 | Click [Register] button | Validation error message appears below 'Confirm Password' field |

###### 1.5 Fields not filled in
Test 9. Empty form submition. We try to send empty form or not fully filled in form.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Click [Register] button | Validation error message appears below all mandatory fields |
| 2 | Fill in all mandatory fields except 'E-Mail' field | Validation error message appears below 'E-Mail' field |


###### 1.6 Mandatory fields verification
Test 10. Now let's see how system behaves if 'Last Name' field is not mandatory.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Keep 'Last Name' field empty| 'Last Name' field is not filled in |
| 5 | Click [Register] button | User account is created |

###### 1.7 Existing in the system mail verification
Test 11. Pre-requisite to this test is that test@cognified.com email already exists in the system. Again validation is on [Register] button click.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type test@cognified.com email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field | 'Last Name' field is filled in |
| 5 | Click [Register] button | Validation error message appears below 'E-Mail' field |

###### 2. Fields Validation - Backend
Let's now enter developers area and try to test some API. I can imagine that register form is sent somwhere and data are stored in some DB. I have experience in REST API testing.

###### 2.1 Boundary values verification - frontend/backend fields size verification
Test 12. In the previous boundary values verification we concentrated on frontend validation. I can imagine situation where backend validation is different than frontend or even does not exist. Let's say frontend allows 55 characters and backend only 50 in each field.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing 51 characters email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type 51 characters password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field with 51 characters | 'Last Name' field is filled in |
| 5 | Click [Register] button | Validation messages appear below each input field |

###### 2.2 Characters and whitespace characters verification
Test 13. What about whitespace characters?.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field with space at the beginning of the mail | 'E-Mail' input field is filled in |
| 2 | Type password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field | 'Last Name' field is filled in |
| 5 | Click [Register] button | Validation messages appear below each input field |
| 6 | Verify in DB that space is left trimed in email | No spaces in email address |

###### 2.3 Verification of DB columns types definition
Test 14. It does happen often but I can imagine situation when DB column types cannot handle values that are sent by the frontend side. Let's say password field is not encrypted and is an integer in DB.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field with space at the beginning of the mail | 'E-Mail' input field is filled in |
| 2 | Type  password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 2 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field with | 'Last Name' field is filled in |
| 5 | Click [Register] button | Validation messages appear below 'Password' and 'Confirm Password' fields |

###### 2.4 In addition - verification of http statuses
Test 15. This is rather task for developers but I would be happy to do that. Correct http responses are important, bacause it easily says that 500 - something is wrong with server, 404 - elements or even pages are not found, or 200 - everything is running smothly.

This is the time to describe how backend testing would be done by me. I have experience in using RESTAssured framework which can be easily integrated with selenium framework from Task 3. Selenium + RESTAssured = Frontend + Backend = Client is happy. Big advantage of REST API tests automation is time of execution and opportunity to send many test json files. Big test data sets.
Example below:

JsonFile
```sh

{
  "e-mail": "test@cognified.com",
  "password": "testowo",
  "lastName": "chingchangchung",
}
```
Test
```sh
String myJson = new Scanner(new File(JsonFile)).useDelimiter("\\Z").next();

        expect()
                .statusCode(201)
                .log().ifError()
        .given()
                .contentType("application/json")
                .body(JsonFile)
        .when().with()
                .header("Access-Control-Request-Headers", "content-type")
                .header("Connection", "keep-alive")
                .header("Accept-Language", "en-US,en;q=0.8")
                .header("Host", "backend:port")
                .header("Access-Control-Request-Method", "POST")
                .header("Content-Type", "application/json;charset=UTF-8")
                .header("Accept", "application/json, text/plain, */*")
                .header("Origin", "some frontend address")
                .header("Referer", "path to index.html")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (HTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
                .header("Accept-Encoding", "gzip,deflate,sdch")
                .header("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.3")
.post("/register-endpoint");
```

### Performance Testing
###### 1. Response time of single request verification
Test 16. Above example can be used to test also performance of a single request. Obviously we test only performance of a server side. I usually use PageSpeed plugin for Chrome to quickly check how performance of frontend side can be improved. I'm sure developers know that.

###### 2. Multi-threading verification. Service should handle many requests in the same time
Test 17. Above test can be repeated for several users. We would like to know how time of repsonse drops down with many 'Register' requests in the same time. 

###### 3. Stress test of a service. Verification that service fail in expected way.
Test 18. I would also check how system behaves in the situation when internet connection fails while registering new user.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Type existing email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 2 | Type  password into 'Password' field | 'Password' field is filled in |
| 3 | Type the same password as in step 3 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 4 | Fill in 'Last Name' field with | 'Last Name' field is filled in |
| 5 | Click [Register] button and in the same time disconnect from the network | User is disconnected from the network, no response from the server |
| 6 | Verify in DB user is created | User is created |

### Security Testing
###### 1. SQL injection
Test 19. One way to verify that backend is well secured is to try inject some SQL queries. I assume that Backend is connected to SQL DB not into NOSQL DB.
Obviously we guess what DB it is and what tables can have. Well secured backend does not allow concatenation.

###### 2. Encrypted password or secured connection
Test 20. In modern applications every authentications functionalities are encrypted by means of secured connection. But I can imagine that this Register form does not have this security level. So the test would verify if the password is encrypted when sending to the Backend.

| No. | Step | Expected Result |
| ------ | ------ |--- |
| 1 | Open Dev tools in browser (firefox) and navigate to 'Network' tab | DEV tools and 'Network' tab are open |
| 2 | Type existing email into 'E-Mail' field | 'E-Mail' input field is filled in |
| 3 | Type  password into 'Password' field | 'Password' field is filled in |
| 4 | Type the same password as in step 3 into 'Confirm Password' field | 'Confirm Password' field is filled in |
| 5 | Fill in 'Last Name' field with | 'Last Name' field is filled in |
| 6 | Click [Register] button | User account is created |
| 7 | Verify in last 'Save' form (PUT) method password is encrypted | Password is encrypted |

### Usability Testing
The last thing that could be checked for this little screen is usability.
Test 21. Last Name field - this field looks a bit different than other fields. In addition I would ask Product Owner and developers if this field is indeed necessary, because user is identified by unique email. What is the purpose of this field?

