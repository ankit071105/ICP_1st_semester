import turtle
import colorsys
t=turtle.Turtle()
s=turtle.Screen()
s.bgcolor("black")
t.speed(0)
n=36
h=0.5
for i in range(80):
  c=colorsys.hsv_to_rgb(h,1,2)
h+=1/n
t.color(c)
t.left(5)
for j in range(5):
    t.forward(250)
    t.left(144)