data ()
data("airquality")
sapply(airquality,class)

dim(airquality)
summary(airquality)
         
is.na(airquality)

   sum(is.na(airquality))
mean(is.na(airquality))
airquality$Ozone[is.na(airquality$Ozone)]<-mean(airquality$Ozone,na.rm =TRUE)
airquality
na.omit(airquality)
 

