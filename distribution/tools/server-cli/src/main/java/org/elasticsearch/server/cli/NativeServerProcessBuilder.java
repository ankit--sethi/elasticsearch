package org.elasticsearch.server.cli;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NativeServerProcessBuilder extends ServerProcessBuilder {

    @Override
    protected String getCommand() {
        Path esHome = this.processInfo.workingDir();
        // /Users/ankitsethi/IdeaProjects/elasticsearch/distribution/archives/darwin-aarch64-tar/build/install/elasticsearch-9.0.1-SNAPSHOT

        Path projectRoot = esHome.getParent() // Moves to
            // /Users/ankitsethi/IdeaProjects/elasticsearch/distribution/archives/darwin-aarch64-tar/build/install/
            .getParent() // Moves to /Users/ankitsethi/IdeaProjects/elasticsearch/distribution/archives/darwin-aarch64-tar/build/
            .getParent() // Moves to /Users/ankitsethi/IdeaProjects/elasticsearch/distribution/archives/darwin-aarch64-tar/
            .getParent() // Moves to /Users/ankitsethi/IdeaProjects/elasticsearch/distribution/archives/
            .getParent() // Moves to /Users/ankitsethi/IdeaProjects/elasticsearch/distribution/
            .getParent(); // Moves to /Users/ankitsethi/IdeaProjects/elasticsearch/
        Path targetPath = projectRoot.resolve("server/build/native/nativeCompile/application");
        return targetPath.toString();
    }

    @Override
    public ServerProcessBuilder withJvmOptions(List<String> jvmOptions) {
        List<String> copy = new ArrayList<>(jvmOptions);
        copy.removeIf(t -> t.startsWith("-X") || t.startsWith("-XX:"));
        this.jvmOptions = copy;
        return this;
    }

}
