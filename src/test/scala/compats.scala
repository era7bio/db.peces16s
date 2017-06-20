package era7bio.db.16s18s.test

import ohnosequences.statika._, aws._
import ohnosequences.awstools._, regions._, ec2._, autoscaling._, s3._

case object compats {

  type DefaultAMI = AmazonLinuxAMI[Ireland.type, HVM.type, InstanceStore.type]
  val  defaultAMI: DefaultAMI = AmazonLinuxAMI(Ireland, HVM, InstanceStore)

  class DefaultCompatible[B <: AnyBundle](bundle: B, javaHeap: Int) extends Compatible(
    amznAMIEnv(defaultAMI, javaHeap),
    bundle,
    era7bio.db.generated.metadata.db16s18s
  )

  case object pick16SCandidates extends
    DefaultCompatible(era7bio.db.16s18s.test.pick16SCandidates, javaHeap = 50)

  case object dropRedundantAssignmentsAndGenerate extends
    DefaultCompatible(era7bio.db.16s18s.test.dropRedundantAssignmentsAndGenerate, javaHeap = 10)

  case object clusterSequences extends
    DefaultCompatible(era7bio.db.16s18s.test.clusterSequences, javaHeap = 10)

  case object dropInconsistentAssignmentsAndGenerate extends
    DefaultCompatible(era7bio.db.16s18s.test.dropInconsistentAssignmentsAndGenerate, javaHeap = 10)
}
