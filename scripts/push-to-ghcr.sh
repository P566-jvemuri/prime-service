set -u
: "$VERSION"

echo ${secrets.ACCESS_TOCKEN} | docker login ghcr.io --username jahnavi-vemuri --password-stdin
docker push ghcr.io/p566-jvemuri/prime-service:$VERSION