[33mcommit 72f11c248006765f5751f033e0eecccb62b861ed[m[33m ([m[1;36mHEAD -> [m[1;32mmaster[m[33m, [m[1;31morigin/master[m[33m)[m
Author: mustafasan088706 <san.mustafa0887@gmail.com>
Date:   Sat Apr 10 19:48:52 2021 +0200

    made up all abstract classes for each value

[1mdiff --git a/src/Database/MyDatabase.java b/src/Database/MyDatabase.java[m
[1mindex 895a0be..37670f4 100644[m
[1m--- a/src/Database/MyDatabase.java[m
[1m+++ b/src/Database/MyDatabase.java[m
[36m@@ -1,5 +1,25 @@[m
 package Database;[m
 [m
[31m-public class MyDatabase {[m
[32m+[m[32mpublic abstract class MyDatabase {[m
 [m
[32m+[m[32mpublic MyDatabase() {[m
[32m+[m[41m	[m
[32m+[m[32m}[m
[32m+[m
[32m+[m	[32mpublic abstract boolean connect (String sqliteDb);[m
[32m+[m	[32mpublic abstract boolean connect(String dbName,String userName,String userPass,String host,int port);[m
[32m+[m[41m	[m
[32m+[m	[32mpublic abstract void disConnected();[m
[32m+[m	[32mpublic abstract int addData(String insertQuery);[m
[32m+[m	[32mpublic abstract int addData (String nameOftable,String columns,String values);[m
[32m+[m	[32mpublic abstract ResultSet listOfvalues(String selectQuery);[m
[32m+[m[41m	[m
[32m+[m	[32mpublic abstract boolean deleteData(String query);[m
[32m+[m	[32mpublic abstract int deleteData(String nameOftable,String whereCondition);[m
[32m+[m	[32mpublic abstract int updateDatad(String query);[m
[32m+[m	[32mpublic abstract int updateData(String nameOftable,String update,String condition);[m
[32m+[m	[32mpublic abstract int totalNumberOfrows(String query);[m
[32m+[m	[32mpublic abstract int totalNumberOftables();[m
[32m+[m[41m	[m
[32m+[m[41m	[m
 }[m
