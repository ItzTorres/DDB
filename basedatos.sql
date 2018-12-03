-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: venta
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `producto` (
  `idProducto` int(5) unsigned NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `NumeroDeUnidadesExist` int(11) DEFAULT NULL,
  `PrecioUnitario` double DEFAULT NULL,
  `FechaIngreso` varchar(20) DEFAULT NULL,
  `idProveedor` int(4) unsigned DEFAULT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `idProveedor` (`idProveedor`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idproveedor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (60001,'BANDA MS-La mejor version de mi',39,400,'18-Abril-2017',7001),(60002,'BANDA MS-Que bendicion',12,350,'07-Febrero-2016',7001),(60003,'BANDA MS-No me pidas perdon',12,390,'28-Junio-2014',7001),(60004,'BANDA MS-Mi razon de ser',18,490,'21-Noviembre-2012',7001),(60024,'ACDC-Highway to Hell',10,560,'10-Mayo-2014',7007),(60025,'ACDC-Back in Black',57,650,'18-Junio-2013',7007),(60026,'ACDC-Fly on the Wall',15,380,'21-Abril-2016',7007),(60027,'ACDC-Rock or Bust',13,345,'30-Marzo-2013',7007),(60028,'MICHAEL JACKSON-Forever',32,720,'01-Marzo-2014',7008),(60029,'MICHAEL JACKSON-Off the Wall',16,190,'04-Enero-2015',7008),(60030,'MICHAEL JACKSON-Thriller',19,480,'09-Diciembre-2016',7008),(60031,'MICHAEL JACKSON-Bad',14,390,'18-Noviembre-2016',7008),(60032,'BRUNO MARS-Doo-Wops & Holligans',19,160,'21-Febrero-2015',7009),(60033,'BRUNO MARS-Unorthodox Jukebox',20,360,'16-Mayo-2016',7009),(60035,'BRUNO MARS-24K Magic',32,480,'17-Junio-2017',7009),(60036,'KISS-Love Gun',17,540,'21-Enero-2016',7010),(60037,'KISS-Unmasked',20,240,'17-Agosto-2015',7010),(60038,'KISS-Creatures',18,360,'19-Septiembre-2016',7010),(60039,'KISS-Animalize',15,390,'05-Julio-2015',7010),(60040,'GUNS N ROSES-Use Your Illusion I',18,160,'15-Mayo-2016',7011),(60041,'GUNS N ROSES-The Spaghetti Incident',16,170,'19-Febrero-2014',7011),(60042,'GUNS N ROSES-Chinese Democracy',13,290,'14-Abril-2015',7011),(60043,'GUNS N ROSES-Appetite for Destruction',19,390,'23-Marzo-2015',7011),(60044,'JOAN SEBASTIAN-Tu y yo',9,390,'26-Marzo-2016',7012),(60045,'JOAN SEBASTIAN-Siempre romántico',16,445,'14-Febrero-2015',7012),(60046,'EAGLES-Hotel California',19,522,'13-Diciembre-18',7002),(60047,'METALLICA-Master of Puppets',96,366,'06-Diciembre-17',7002),(60048,'METALLICA-Metallica',6,393,'22-Junio-18',7002),(60049,'VAN HALEN-5150',38,449,'13-Julio-18',7002),(60050,'METALLICA-Ride the Lightning',85,565,'24-Junio-19',7002),(60051,'RHCP-Californication',62,445,'03-Marzo-19',7002),(60052,'BLACK SABBATH-Paranoid',84,449,'21-Mayo-19',7002),(60053,'DUA LIPA-Dua Lipa',60,587,'28-Junio-19',7002),(60054,'MICHAEL JACKSON-Michael',35,244,'18-Noviembre-17',7003),(60055,'SIDDHARTHA-Unicos',7,317,'16-Septiembre-19',7003),(60056,'SOAD-Toxicity',28,382,'25-Julio-18',7003),(60057,'SOAD-Mezmerize',9,476,'13-Febrero-19',7003),(60058,'SOAD-Hypnotize',60,514,'19-Julio-19',7003),(60059,'LOS DANIELS-A Casa',61,382,'31-Mayo-18',7003),(60060,'LOS DANIELS-Amanecer',42,562,'11-Diciembre-18',7003),(60061,'LOS DANIELS-Moodanza',69,440,'29-Enero-19',7003),(60062,'ZOE-Programaton',26,300,'12-Marzo-18',7004),(60063,'ZOE-Reptilectric',74,253,'29-Marzo-19',7004),(60064,'ZOE-Rocanlover',2,230,'17-Diciembre-17',7004),(60065,'IRON MAIDEN-Iron Maiden',1,249,'20-Junio-18',7004),(60066,'IRON MAIDEN-Killers',6,406,'14-Febrero-18',7004),(60067,'IRON MAIDEN-Dance of Death',11,452,'16-Julio-19',7004),(60068,'ODISSEO-Dias de Fuego',35,315,'02-Febrero-19',7004),(60069,'HEROES DEL SILENCIO-AVALANCHA',7,273,'24-Mayo-19',7004),(60070,'HEROES DEL SILENCIO-RAREZAS',75,503,'29-Mayo-18',7004),(60071,'HEROES DEL SILENCIO-Senderos',88,483,'08-Octubre-18',7004),(60072,'NIRVANA-Nirvana',91,594,'15-Agosto-18',7005),(60073,'NIRVANA-In Utero',86,292,'26-Noviembre-17',7005),(60074,'NIRVANA-Never Mind',57,334,'02-Octubre-18',7005),(60075,'TAME IMPALA-Currents',6,252,'12-Marzo-18',7005),(60076,'RAMMSTEIN-Mutter',72,507,'24-Octubre-19',7005),(60077,'COLDPLAY-Parachutes',37,428,'04-Junio-19',7005),(60078,'COLDPLAY-Viva la Vida',13,392,'03-Noviembre-18',7005),(60079,'COLDPLAY-Ghost Stories',54,374,'31-Enero-18',7005),(60080,'GUNS N ROSES-Chinesse Democracy',16,523,'09-Enero-19',7005),(60081,'MIRO-A Traves del Reflejo',14,431,'07-Agosto-18',7017),(60082,'MIRO-Rock On',30,244,'16-Julio-19',7004),(60083,'NOFX-Punk in Drublic',16,312,'31-Marzo-18',7019),(60084,'NOFX-The War on Errorism',63,389,'08-Mayo-19',7019),(60085,'OFFSPRING-Americana',97,537,'25-Octubre-19',7019),(60086,'OFFSPRING-Conspiracy of One',74,264,'05-Noviembre-17',7019),(60087,'OFFSPRING-Inaxy on the Hombre',59,519,'20-Mayo-19',7019),(60088,'BAD RELIGION-Stranger than Fiction',73,489,'14-Diciembre-17',7019),(60089,'EPICA-Design Your Universe',19,499,'29-Mayo-18',7006),(60090,'ACDC-Back in Black',95,557,'21-Octubre-19',7007),(60091,'LOS MARTY-Historias de un Cowboy',66,203,'14-Febrero-19',7014),(60092,'TRIVIUM-SHOGUN',41,383,'29-Diciembre-18',7015),(60093,'SNOOP DOG-Doggystyle',26,587,'12-Junio-19',7016),(60094,'KINGS OF LEON-Only by the Night',60,209,'24-Julio-19',7016),(60095,'ARCH ENEMY-War Eternal',75,274,'06-Febrero-18',7020),(60096,'MEGADETH-Rust in Peace',52,531,'29-Mayo-19',7013),(60097,'RADIOHEAD-Pablo Honey',83,391,'01-Febrero-19',7013),(60098,'RADIOHEAD-In Rainbows',67,449,'26-Enero-18',7013),(60099,'ESTRAMBOTICOS-Lagrimas y Risas',97,563,'16-Febrero-18',7018);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `proveedor` (
  `idProveedor` int(4) unsigned NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Telefono` varchar(12) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (7001,'Sergio Lizarraga','5537486860','Calle Rrovera No.48 planta alta','Sergliz@outlook.com'),(7002,'Warner Bros. Records','3373849523','CALLE Leibnitz No. 32 col. Nueva Anzures','warner@records.com'),(7003,'Sony Music','3843568422','Boulvard Miguel Avila Camacho No. 191 Los morales','sony@records'),(7004,'EMI','7812435590','366 Kensington High Street','emi@records'),(7005,'Universal','5543789543','Yautepec No 107 Condesa','@records'),(7006,'Nuclear Blast','3565478767','Buckingham Park 5741','nb@records'),(7007,'Atlantic Records','7218437212','Calle evericio No 70 col. Santa clara','Atlantic@records.com'),(7008,'Teddy Roley','7842015301','Miguel Tejeda No.48 Col. Industrial','Teddy@products.com'),(7009,'NSR Records','5497863155','norte 45 col. industrial hollywood','NRS@producciones.com'),(7010,'Vini Poncia','3813458825','cra No.48 BPI departamento Huanrco','vinirecords@products.com'),(7011,'Geffen Records/Mike Clink','3325301145','Godoy Cruz No.2355 Cordoba','Mikeclink@geffenrecords.com'),(7012,'Fonovista Records','5578963254','Aguazul No. 38 Municipio Naucalpan','vista@records.com.es'),(7013,'Capitol Records','3354765897','3322 West End Building','capitol@records'),(7014,'Iguana Records','5523789656','Av San Fernando No 649 Col. pena pobre','iguana@records'),(7015,'Roadrunner Records','3365768900','1290 6th Ave','roadrunner@records'),(7016,'RCA Records','5548796523','','rca@records'),(7017,'Dragora Records','5548795620','','dragora@records'),(7018,'Resiste Records','5578336509','','resiste@records'),(7019,'Epitaph Records','3354789655','Los Angeles, California','epitaph@records'),(7020,'Century Media','4455887799','Los Angeles, California','centurym@records');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuario` (
  `idUsuario` int(4) unsigned NOT NULL,
  `Nombre` varchar(25) DEFAULT NULL,
  `apPaterno` varchar(25) DEFAULT NULL,
  `apMaterno` varchar(25) DEFAULT NULL,
  `FechaContratacion` varchar(25) DEFAULT NULL,
  `Salario` double unsigned DEFAULT NULL,
  `Contraseña` varchar(15) DEFAULT NULL,
  `Direccion` varchar(60) DEFAULT NULL,
  `Telefono` varchar(10) DEFAULT NULL,
  `Tipo` varchar(10) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (2001,'Christian','Montiel','Guerrero','12-Diciembre-2010',35025.75,'Gerente','Col.La huasteca, Miguel Hidalogo, DF','53596387','1','antonio1@gmail.com'),(2002,'Juan','Perez','Gonzalez','8-Octubre-2016',18000,'Cajero','Col. Lindavista, Cuahutemoc,DF','53763422','2','juan_perez@gmail.com'),(2003,'Juan','Perez','Gonzalez','8-Octubre-2016',18000,'Cajero','Col. Lindavista, Gustavo Amadero,DF','53763422','2','juan_perez@gmail.com'),(2004,'Daniela','Cabrera','Ayuso','12-Abril-2017',12500,'Cajera','Col. Zona Escolar, Gustavo Amadero,DF','53763422','2','daniela_cab@outlook.com'),(2005,'Angelica','Solis','Avila','03-Septiembre-2012',21530.25,'Cajera','Col.Azul, Azcapotzalco, DF','55632148','2','mariaCruz@outlook.com'),(2006,'Gabriel','Torres','Rivera','15-Julio-2017',15250,'Cajero','Col. Claveria, Azcapotzalco,DF','53763422','2','gabs_torres@gmail.com'),(2007,'Jorge','Peralta','Najera','1-Septiembre-2017',19000,'Cajero','Col. Tlatelolco, Cuahutemoc,DF','53763422','2','jorge_peralta@gmail.com'),(2008,'Ana','Rodriguez','Gonzalez','7-Mayo-2018',17400,'Cajera','Col. Claveria, Azcapotzalco,DF','53763422','2','ana_rodriguez@gmail.com'),(2009,'Gretta','Estrada','Millan','23-Enero-2016',18800,'Cajera','Col. El rodeo, Iztacalco,DF','53763422','2','gretta_estrada@gmail.com'),(2010,'Jocelyn','Herrera','Lomeli','9-Diciembre-2018',12700,'Cajera','Col. Lindavista, Coyoacan,DF','53763422','2','jocelyn_herrera@gmail.com'),(2011,'Karla','Palacios','Medina','7-Febrero-2016',16850,'Cajera','Col. Aragon, Gustavo Amadero,DF','53763422','2','karla_palacios@yahoo.com'),(2012,'Daniel','Gomez','Ulloa','24-Diciembre-2016',19000,'Cajero','Col. Lindavista, Gustavo Amadero,DF','53763422','2','daniel_ulloa@gmail.com'),(2013,'Astrid','Gonzalez','Avila','30-Agosto-2018',18900,'Cajera','Col. La Huasteca, Miguel Hidalgo,DF','53763422','2','astrid_gonzales@gmail.com'),(2014,'Lucia','Reyes','Hernandez','18-Marzo-2018',17800,'Cajera','Col. Tlatelolco, Cuahutemoc,DF','53763422','2','lucia_reyes@gmail.com'),(2015,'Miriam','Suarez','Gaitan','28-Mayo-2017',13550,'Cajera','Col. Claveria, Azcapotzalco,DF','53763422','2','miriam_turner@gmail.com'),(2016,'Ivana','Godoy','Gutierrez','14-Junio-2018',19784,'Cajero','Apdo.:463-3455 Lobortis C.','5540856459','2','Ivana.Godoy@gmail.com'),(2017,'Jeremi','Perez','Espinoza','27-Agosto-2018',16279,'Cajero','694-9211 Nulla Carretera','5524866918','2','Jeremi.Perez@gmail.com'),(2018,'Karim','Cortes','Molina','26-Diciembre-2018',15944,'Cajero','3450 Integer Avenida','5534298697','2','Karim.Cortes@gmail.com'),(2019,'Milenka','Vargas','Rojas','24-Mayo-2019',19342,'Cajero','3942 Diam C/','5597723603','2','Milenka.Vargas@gmail.com'),(2020,'Franz','Caceres','Flores','14-Marzo-2018',19481,'Cajero','Apartado No. 291, 4593 Tellus Calle','5529988644','2','Franz.Caceres@gmail.com'),(2021,'Isaak','Jimenez','Muñoz','14-Septiembre-2019',18557,'Cajero','830-1643 Ultricies Calle','5520906028','2','Isaak.Jimenez@gmail.com'),(2022,'Anays','Vera','Cortes','17-Marzo-2019',19712,'Cajero','2754 Tristique Calle','5526840999','2','Anays.Vera@gmail.com'),(2023,'Misael','San Martin','Sepulveda','02-Diciembre-2017',16876,'Cajero','4580 Vel Avda.','5541071450','2','Misael.San Martin@gmail.com'),(2024,'Bautista','Escobar','Garrido','03-Abril-2018',18421,'Cajero','Apartado No. 503, 5323 Non Carretera','5526604609','2','Bautista.Escobar@gmail.com'),(2025,'Lissette','Henriquez','Peña','27-Noviembre-2017',17237,'Cajero','Apartado No. 892, 8966 Interdum Avenida','5528600420','2','Lissette.Henriquez@gmail.com'),(2026,'Aracely','Araya','Nuñez','02-Enero-2019',17856,'Cajero','4898 Vel Carretera','5531535894','2','Aracely.Araya@gmail.com'),(2027,'Ali','Silva','Castillo','02-Mayo-2018',19232,'Cajero','518-4985 Orci. C/','5583805942','2','Ali.Silva@gmail.com'),(2028,'Dorian','Tapia','Reyes','15-Julio-2018',15145,'Cajero','Apdo.:604-3534 Vel, Avenida','5563733536','2','Dorian.Tapia@gmail.com'),(2029,'Nain','Aravena','Cortes','22-Diciembre-2017',16147,'Cajero','Apartado No. 897, 3479 At C/','5533757922','2','Nain.Aravena@gmail.com'),(2030,'Danna','Valdes','Pizarro','29-Marzo-2018',18353,'Cajero','7489 Neque Calle','5537085435','2','Danna.Valdes@gmail.com'),(2031,'Elian','Cortes','Saavedra','08-Agosto-2018',19666,'Cajero','1780 Aliquam Calle','5521446479','2','Elian.Cortes@gmail.com'),(2032,'Hugo','Parra','Araya','22-Mayo-2018',18033,'Cajero','757-7294 Molestie. Calle','5506033926','2','Hugo.Parra@gmail.com'),(2033,'Angely','Torres','Rodriguez','18-Julio-2018',15280,'Cajero','Apdo.:134-1869 Mus. Avenida','5538457738','2','Angely.Torres@gmail.com'),(2034,'Cristobal','Molina','Rodriguez','23-Enero-2018',19026,'Cajero','4792 Tristique Carretera','5540943313','2','Cristobal.Molina@gmail.com'),(2035,'Anahis','Escobar','Vasquez','09-Marzo-2018',18311,'Cajero','1457 Mauris, Calle','5509392368','2','Anahis.Escobar@gmail.com'),(2036,'Catherine','Vera','Garrido','17-Octubre-2019',17442,'Cajero','963-2507 Morbi Carretera','5574087143','2','Catherine.Vera@gmail.com'),(2037,'Matilde','Pino','Zuñiga','15-Diciembre-2018',17539,'Cajero','417-8625 Ut Ctra.','5522571049','2','Matilde.Pino@gmail.com'),(2038,'Denisse','Paredes','Vergara','19-Marzo-2019',18056,'Cajero','966-287 Sagittis C.','5598690185','2','Denisse.Paredes@gmail.com'),(2039,'Leonardo','Gallardo','Gomez','23-Julio-2019',19115,'Cajero','591-3624 Arcu. Carretera','5553419552','2','Leonardo.Gallardo@gmail.com'),(2040,'Luka','Sanhueza','Rojas','09-Enero-2019',18071,'Cajero','Apartado No. 914, 9791 Pretium Av.','5561694421','2','Luka.Sanhueza@gmail.com'),(2041,'Yonatan','Tapia','Rodriguez','30-Mayo-2019',18163,'Cajero','Apartado No. 499, 7276 Fusce Avenida','5567264893','2','Yonatan.Tapia@gmail.com'),(2042,'Yanira','Saavedra','Alvarez','24-Junio-2018',18289,'Cajero','8189 Gravida Calle','5511948030','2','Yanira.Saavedra@gmail.com'),(2043,'Estefani','San Martin','Torres','10-Septiembre-2018',19144,'Cajero','Apartado No. 774, 3413 Porta C.','5576021791','2','Estefani.San Martin@gmail.com'),(2044,'Jonathan','Bustos','Vasquez','19-Febrero-2019',16124,'Cajero','Apartado No. 442, 6456 Ligula. Ctra.','5552380765','2','Jonathan.Bustos@gmail.com'),(2045,'Barbara','Contreras','Vega','10-Abril-2018',19259,'Cajero','690-3599 Tempor C.','5536423826','2','Barbara.Contreras@gmail.com'),(2046,'Emilia','Parra','Saavedra','03-Marzo-2019',16297,'Cajero','982-6822 A Avda.','5571301894','2','Emilia.Parra@gmail.com'),(2047,'Luz','Vargas','Moreno','16-Noviembre-2018',16190,'Cajero','359-5532 Cum C/','5572218122','2','Luz.Vargas@gmail.com'),(2048,'Alina','Salinas','Morales','29-Agosto-2019',17698,'Cajero','Apdo.:878-9009 Non, C/','5592177418','2','Alina.Salinas@gmail.com'),(2049,'Demmian','Araya','Caceres','03-Octubre-2019',15117,'Cajero','Apdo.:715-3858 Libero Calle','5516948339','2','Demmian.Araya@gmail.com'),(2050,'Chriss','Sanhueza','Hernandez','07-Octubre-2019',16310,'Cajero','Apdo.:887-1122 Ultrices Av.','5535116286','2','Chriss.Sanhueza@gmail.com');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `venta` (
  `idVenta` int(7) unsigned NOT NULL,
  `MontoVenta` double DEFAULT NULL,
  `TipoPago` varchar(20) DEFAULT NULL,
  `FechaVenta` varchar(20) DEFAULT NULL,
  `idUsuario` int(4) unsigned DEFAULT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `idUsuario` (`idUsuario`),
  CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idusuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventaproducto`
--

DROP TABLE IF EXISTS `ventaproducto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ventaproducto` (
  `idVenta` int(7) unsigned NOT NULL,
  `idProducto` int(5) unsigned NOT NULL,
  `num` int(11) DEFAULT NULL,
  PRIMARY KEY (`idVenta`,`idProducto`),
  KEY `idProducto` (`idProducto`),
  CONSTRAINT `ventaproducto_ibfk_1` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idventa`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ventaproducto_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idproducto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventaproducto`
--

LOCK TABLES `ventaproducto` WRITE;
/*!40000 ALTER TABLE `ventaproducto` DISABLE KEYS */;
/*!40000 ALTER TABLE `ventaproducto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-29 23:40:50
