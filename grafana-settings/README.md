What is available:
    GF_PATHS_HOME=/usr/share/grafana
    GF_PATHS_LOGS=/var/log/grafana
    GF_PATHS_PLUGINS=/var/lib/grafana/plugins

What we override:
    GF_PATHS_DATA=/var/lib/grafana
    GF_PATHS_PROVISIONING=/etc/grafana/provisioning
    GF_PATHS_CONFIG=/etc/grafana/grafana.ini

Technique used to mount volume to docker:
- bind-mount --> directory in host become linked with those in container
- volume --> directory managed by Docker is created on host, accessible by docker/container only
- tmpfs