# Grafana local
docker run -d \
  --network "host" \
  --env "GF_PATHS_DATA=/override/data" \
  --env "GF_PATHS_PROVISIONING=/override/grafana/provisioning" \
  --env "GF_PATHS_CONFIG=/override/grafana/grafana.ini" \
  --mount type=bind,source="$(pwd)/data",destination="/override/data" \
  --mount type=bind,source="$(pwd)/grafana",destination="/override/grafana" \
  grafana/grafana

