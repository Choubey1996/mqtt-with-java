Project Requirement 
jdk - (Java Development KIt)
Ide -   STS 4.1
Mosquitto -broker
postman -
Steps to download  for  jdk  in ubantu 
sudo apt-get install openjdk-11-jdk
sudo apt-get update
to test  run  java --version
steps for sts

sts(Spring Tool suit)-link to download -https://spring.io/tools]
Extract the zip file, and then install the STS package using it.

Extract the zip file, and then install the STS package using it.
You will see a Launch button in the dialog box on the desktop of the Spring Tool Suite 4 launcher. Click on that button.
Launch of the STS follows in step four.

steps for the  mosquitto
sudo apt-get install mosquitto
sudo apt-get install mosquitto-clients
sudo apt clean

to test   run 
mosquitto_pub -t 'test/topic' -m 'hello World'

t -topic can be any  as per desire
m -message  -as per your desire

for subscribe 
mosquitto_sub -v -t 'test/topic'

for postman 
sudo snap install postman
api to hit in it -localhost:8080/sendMessage
body in json 
{
"topic" : "aaaa",
"message" : {
    "data": "abcd"
}

}
