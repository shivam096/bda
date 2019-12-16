data()
data("mtcars")
sapply(mtcars,class)

head(mtcars,2)

nrow(mtcars)

ncol(mtcars)
a=0
m=0
for (i in nrow(mtcars)) {
  
  ifelse(mtcars[i,9]==1, a<-a+1,m<-m+1)
  
  ifelse(a>m, print("auto") , print("manual"))
  
}

x=mtcars$hp
y=mtcars$wt
plot(x,y)
