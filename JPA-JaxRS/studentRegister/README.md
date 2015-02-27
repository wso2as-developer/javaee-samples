Student Register
=================

Student register is a sample for JPA-JaxRS. This webapp has operations add, get, getall and remove. 
There is a default student "John" with the  index 100. Following is a list of resources with a brief
description on how they are invoked.

/student/add
-------------
This is a POST request and is used to add a student. It accepts both json and xml inputs. You cannot
add two students with the same index.

Sample json input:
```json
{
    "Student": {
        "index" : 1,
        "name: "Nimal"
    }
}
```

Sample xml input:
```xml
<Student>
    <index>21</index>
    <name>Nimal</name>
</Student>
```
/student/getall
---------------
This is a GET method to retrieve the list of students. It can output the data both in xml and json
based on the Accept header.

/student/get/{index}
--------------------
This is a GET method to retrive the data of a student with the specified index. It can output the
data both in xml and json based on the Accept header.

Sample request: `/student/get/100`

/student/remove/{index}
-----------------------
This is a DELETE method to delete the student with the specified index.

Sample request: `/student/remove/100`