# How to use Docker

# steop 0
# install docker and run it

# step 1 
# git clone https://github.com/lpf1072564053/new_exam

# step 2
# docker pull maven:3.6.3-openjdk-8-slim

# step 3
## windows (run in CMD)
## projectDir=/c/exam_new/ (your project directory)
## docker run -it -d --name new_exam -p 8080:80 -v /c/exam_new:/usr/src/mymaven -w /usr/src/mymaven new_exam:v1 /bin/bash 

## linux/mac (run in terminal)
## projectDir=/home/exam_new/ (your project directory)
## docker run -it -d --name new_exam -p 8080:80 -v /home/exam_new:/usr/src/mymaven -w /usr/src/mymaven new_exam:v1 /bin/bash 

# step 4
# docker exec -it new_exam /bin/bash

# step 5
# cd /usr/src/mymaven/ztc && mvn spring-boot:run
