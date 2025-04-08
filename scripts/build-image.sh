set -u
: "$VERSION"

docker build -t ghcr.io/jahnavi-vemuri/prime-service:$VERSION --file ./Dockerfile .