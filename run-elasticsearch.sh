docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:6.6.2

chmod u+x run-elasticsearch.sh
--chmod=+x run-elasticsearch.sh
-am "<run-elasticsearch.sh> is now executable."
