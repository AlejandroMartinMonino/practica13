function light(sw) {
  var pic;
  if (sw == 0) {
    pic = "imagenes/pic_bulboff.gif"
  } else {
    pic = "imagenes/pic_bulbon.gif"
  }
  document.getElementById('myImage').src = pic;
}
