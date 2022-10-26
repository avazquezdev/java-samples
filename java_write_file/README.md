# README
## Introducción

Esto es un ejemplo para ver la escritura de ficheros en Java y el uso del formato UTF-8 con BOM

### ¿Qué es BOM?
Byte order mark o [BOM](https://en.wikipedia.org/wiki/Byte_order_mark) es un conjunto de caracteres **(0xef 0xbb 0xbf)** que se colocan en el comienzo del fichero.

En formato unicode se representa como `\ufeff `

#### Comprobacion de BOM

```
$ hexdump -C /home/mkyong/file.txt
00000000  ef bb bf 6d 6b 79 6f 6e  67 0a 6d 6b 79 6f 6e 67  |...mkyong.mkyong|
00000010
```
o
```
file file.txt
file.txt: UTF-8 Unicode (with BOM) text
```

## Biblioteca
* [Java write to file](https://www.baeldung.com/java-write-to-file)
* [How to add BOM](https://mkyong.com/java/java-how-to-add-and-remove-bom-from-utf-8-file/)
* [Java write UTF-8](https://mkyong.com/java/how-to-write-utf-8-encoded-data-into-a-file-java/)