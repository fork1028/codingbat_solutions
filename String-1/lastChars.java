public String lastChars(String a, String b) {
  if (a.length()>=1 && b.length()>=1)
  return a.substring(0,1)+b.substring(b.length()-1,b.length());
  if (a.length()<=1 && b.length()>=1)
  return "@"+b.substring(b.length()-1,b.length());
  if (a.length()>=1 && b.length()<=1)
  return a.substring(0,1)+"@";
  else
  return "@@";
}

