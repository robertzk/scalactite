val woop = "hey there Mama"

woop.exists(_.isUpper)

/* Note that tab completion does not give all methods because of
   weird trait implementations!

   scala> woop.<Tab>
   +                     concat             intern               replace        toLowerCase
   asInstanceOf          contains           isEmpty              replaceAll     toString
   charAt                contentEquals      isInstanceOf         replaceFirst   toUpperCase
   codePointAt           endsWith           lastIndexOf          split          trim
   codePointBefore       equalsIgnoreCase   length               startsWith
   codePointCount        getBytes           matches              subSequence
   compareTo             getChars           offsetByCodePoints   substring
   compareToIgnoreCase   indexOf            regionMatches        toCharArray */
