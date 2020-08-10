mvn clean install 
- running fom /target
	java -cp zadanieRekrutacyjne-1.0-SNAPSHOT.jar;libs/:.* org.testng.TestNG testng.xml 

docker build .
docker images


for using container start docker-compose with selenium-hub  :
docker-compose up
docker network ls



eg.:
docker run -e "BROWSER=chrome" <name_of_image> 
docker run -e "BROWSER=firefox" <name_of_image> 


docker run -e "BROWSER=chrome" f4d5cf86ecba



docker run -e "BROWSER=chrome" --network zadanierekrutacyjnenexio_default 8ecc8ee73c1f


docker run -e "BROWSER=chrome" -e "HUB_ADDRESS=http://172.18.0.2:4444/wd/hub" --network zadanierekrutacyjnenexio_default 8ecc8ee73c1f


docker run -e "BROWSER=firefox" -e "HUB_ADDRESS=http://localhost:4444/wd/hub" -p 4444:4444  8ecc8ee73c1f